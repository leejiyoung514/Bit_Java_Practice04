package com.javaex.problem03;

public class SmartPhone extends MusicPhone {

	public void execute(String str) {
		// 코드작성

		if ("음악".equals(str)) {
			playMusic();
		} else if ("앱".equals(str)) {
			System.out.println("앱실행");
		} else if("통화".equals(str)) {
			// 코드작성
			//System.out.println("통화기능시작");
			super.execute(str);
		}

	}
	// 메소드작성
	// 메소드작성

	@Override
	protected void playMusic() {
		System.out.println("다운로드해서 음악재생");

	}

}
