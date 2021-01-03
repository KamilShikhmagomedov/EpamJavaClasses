import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        House [] houses = new House[4];
        houses[0] = new House(0, 3, 21, 15, 1, "Воронежская", "Кирпичный", 60);
        houses[1] = new House(1, 26, 45, 2, 2, "Карская", "Деревянный", 30);
        houses[2] = new House(2, 14, 89, 13, 3, "Ленина", "Монолит", 100);
        houses[3] = new House(3, 9, 56, 4, 2, "Бурнаковская", "Деревянный", 30);

        // 1 задание: a) список квартир, имеющих заданное число комнат;

//        System.out.println("Введите количество комнат");
//        int quantityRoomsQuest = Integer.parseInt(reader.readLine());
//        System.out.println(House.arrayHouseQuantityRooms(houses, quantityRoomsQuest));

        // 2 задание: b) список квартир, имеющих заданное число комнат и расположенных на этаже, который находится в заданном промежутке;

//        System.out.println("Введите количество комнат, и диапазон этажей (минимальный и максимальный)");
//        int quantityRoomsQuest = Integer.parseInt(reader.readLine());
//        int floorFirstValue = Integer.parseInt(reader.readLine());
//        int floorSecondValue = Integer.parseInt(reader.readLine());
//        System.out.println(House.arrayHouseQuantityAndFloor(houses, quantityRoomsQuest, floorFirstValue, floorSecondValue));

        // 3 задание: c) список квартир, имеющих площадь, превосходящую заданную.

        System.out.println("Введите площадь");
        int area = Integer.parseInt(reader.readLine());
        System.out.println(House.arrayHouseWhichHaveMoreArea(houses, area));
    }
}
