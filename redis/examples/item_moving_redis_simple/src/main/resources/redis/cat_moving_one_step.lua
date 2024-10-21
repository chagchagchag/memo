local key_list = KEYS[1]

local direction = ARGV[1]
local cat_id = tonumber(ARGV[2])

local curr_pos = redis.call('LPOS', key_list, cat_id)

if(curr_pos == redis.call('LLEN', key_list)-1) then
    if(direction == 'DOWN') then
        curr = redis.call('RPOP', key_list)
        redis.call('LPUSH', key_list, curr)
    end
    return 'SUCCESS'
end

if(curr_pos == 0) then
    if(direction == 'UP') then
        curr = redis.call('LPOP', key_list)
        redis.call('RPUSH', key_list, curr)
    end
end

-- 아래 방향으로 이동일때
if(direction == 'DOWN') then
    arr = redis.call('LRANGE', key_list, curr_pos, curr_pos+1)
    redis.call('LSET', key_list, curr_pos+1, arr[0])
    redis.call('LSET', key_list, curr_pos, arr[1])
else
    arr = redis.call('LRANGE', key_list, curr_pos-1, curr_pos)
    redis.call('LSET', key_list, curr_pos, arr[0])
    redis.call('LSET', key_list, curr_pos-1, arr[1])
end 