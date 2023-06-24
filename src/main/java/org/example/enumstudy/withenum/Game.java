package org.example.enumstudy.withenum;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum Game {
    MAPLE_STORY("메이플 스토리",20) {
        void printInfo() {
            System.out.println("엔젤릭버스터 출동!");
        }
    },
    LOST_ARK("로스트 아크",5) {
        void printInfo() {
            System.out.println("나는 97돌 언제 만들어보나..");
        }
    },
    ANIMAL_CROSSING("동물의 숲",22) {
        void printInfo() {
            System.out.println("최애 주민은 쭈니");
        }
    },
    OVER_WATCH("오버워치",7) {
        void printInfo() {
            System.out.println("사실 사놓고 몇 판 안함");
        }
    },
    LEAGUE_OF_LEGEND("리그 오브 레전드",14) {
        void printInfo() {
            System.out.println("여기에 쏟아부은 시간동안 다른걸 했다면..");
        }
    };

    private final String koreanName;
    private final int year;

    abstract void printInfo();
}
