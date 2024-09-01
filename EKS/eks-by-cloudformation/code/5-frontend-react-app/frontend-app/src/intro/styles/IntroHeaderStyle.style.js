import styled from 'styled-components';

export const IntroHeaderStyle = styled.section`
	width: 100%;
	height: 80vh;
	/* background-color: #282c34; */
	position: relative;
	display: flex;
	justify-content: center;
	&::before {
		content: '';
		position: absolute;
		width: 100%;
		height: 100%;
		top: 0;
		left: 0;
		max-width: 100%;
		min-height: 40px;
		display: inline-block;
		border-radius: 0 0 50% 50% / 0 0 100% 100%;
		transform: scaleX(1.5);
		background-position: right top;
		background-size: 100vw 200px;
		/* background-color: white; */
		background-color: #282c34;
	}
`

export const IntroMainHeaderStyle = styled.div`
	position: relative;
	top: 50%;
	z-index: 1;
	margin: 0 auto;
	max-width: 500px;
	background-color: transparent;
`