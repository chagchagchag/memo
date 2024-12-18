package io.chagchagchag.example.redis_lua_example.domain.cat.api;

import io.chagchagchag.example.redis_lua_example.domain.cat.dto.AddCatRequest;
import io.chagchagchag.example.redis_lua_example.domain.cat.dto.CatResultCode;
import io.chagchagchag.example.redis_lua_example.domain.cat.service.CatRedisService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class CatApi {
    private final CatRedisService catRedisService;

    @PostMapping("/cat")
    public ResponseEntity<CatResultCode> addCat(
            @RequestBody AddCatRequest request
    ) {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(catRedisService.addCatOne(request.getId(), request.getName()));
    }
}
