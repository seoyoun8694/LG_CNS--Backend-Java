package ch08_escaperoom;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class EscapeGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("플레이어 이름을 입력하세요: ");
        String playerName = scanner.nextLine();
        Player player = new Player(playerName);
        Room room = new Room();

        List<Item> items = Arrays.asList(
                new Item("책상"),
                new Item("작은 상자"),
                new Item("서랍장"),
                new Item("침대 밑")
        );

        Random rand = new Random();
        int realKeyIndex = rand.nextInt(items.size());
        int fakeKeyIndex;
        do {
            fakeKeyIndex = rand.nextInt(items.size());
        } while (fakeKeyIndex == realKeyIndex);
        items.get(realKeyIndex).hasRealKey = true;
        items.get(fakeKeyIndex).hasFakeKey = true;

        System.out.println("\n==== 방 탈출 게임 시작 ====");
        System.out.println("플레이어 " + playerName + "님, 탈출을 위해 아이템을 조사하세요.");

        while (true) {
            System.out.println("\n[조사 가능한 아이템 목록]");
            for (int i = 0; i < items.size(); i++) {
                String checked = items.get(i).checked ? "(조사 완료)" : "";
                System.out.println((i + 1) + ". " + items.get(i).name + " " + checked);
            }
            System.out.println("0. 문 열기 시도");

            System.out.print("\n어떤 것을 선택하시겠습니까? >> ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // 버퍼 제거

            if (choice == 0) {
                player.tryToOpenDoor(room);
                if (room.doorOpen) break;
                if (player.hasFakeKey) {
                    System.out.print("다른 곳을 더 조사하시겠습니까? (y/n): ");
                    String retry = scanner.nextLine().trim().toLowerCase();
                    if (retry.equals("n")) {
                        System.out.println("게임을 종료합니다.");
                        break;
                    }
                }
            } else if (choice >= 1 && choice <= items.size()) {
                items.get(choice - 1).check(player);
            } else {
                System.out.println("잘못된 선택입니다.");
            }
        }

        System.out.println("\n=== 게임 종료 ===");
        scanner.close();
    }
}
