package oop1;

public class MusicPlayerMain4 {
    public static void main(String[] args) {
        MusicPlayer mp = new MusicPlayer();

        //뮤직플레이어 전원 온
        mp.on();
        //뮤직플레이어 볼륨 업
        mp.volumeUp();
        //뮤직플레이어 볼륨 업
        mp.volumeUp();
        //뮤직플레이어 볼륨 다운
        mp.volumeDown();
        //뮤직플레이어 상태
        mp.showStatus();
        //전원오프
        mp.off();
    }
}
