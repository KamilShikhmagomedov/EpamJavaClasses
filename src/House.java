import java.util.HashSet;
import java.util.Set;

public class House {
    private int id;
    private int numberHouse;
    private int area;
    private int floor;
    private int quantityRoom;
    private String nameStreet;
    private String typeHouse;
    private int periodExploitation;

    public House(int id, int numberHouse, int area, int floor, String nameStreet) {
        this.id = id;
        this.numberHouse = numberHouse;
        this.area = area;
        this.floor = floor;
        this.nameStreet = nameStreet;
    }

    public House(int id, int numberHouse, int area, int floor, int quantityRoom, String nameStreet, String typeHouse, int periodExploitation) {
        this.id = id;
        this.numberHouse = numberHouse;
        this.area = area;
        this.floor = floor;
        this.quantityRoom = quantityRoom;
        this.nameStreet = nameStreet;
        this.typeHouse = typeHouse;
        this.periodExploitation = periodExploitation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumberHouse() {
        return numberHouse;
    }

    public void setNumberHouse(int numberHouse) {
        this.numberHouse = numberHouse;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getQuantityRoom() {
        return quantityRoom;
    }

    public void setQuantityRoom(int quantityRoom) {
        this.quantityRoom = quantityRoom;
    }

    public String getNameStreet() {
        return nameStreet;
    }

    public void setNameStreet(String nameStreet) {
        this.nameStreet = nameStreet;
    }

    public String getTypeHouse() {
        return typeHouse;
    }

    public void setTypeHouse(String typeHouse) {
        this.typeHouse = typeHouse;
    }

    public int getPeriodExploitation() {
        return periodExploitation;
    }

    public void setPeriodExploitation(int periodExploitation) {
        this.periodExploitation = periodExploitation;
    }

    @Override
    public String toString() {
        return '\n' + "Дом: " +
                "id = " + id +
                ", номер дома = " + numberHouse +
                ", площадь = " + area +
                ", этаж = " + floor +
                ", количество комнат = " + quantityRoom +
                ", улица = " + nameStreet +
                ", тип дома = " + typeHouse  +
                ", срок эксплуатации = " + periodExploitation;
    }

    public static Set<House> arrayHouseQuantityRooms(House[] houses, int quantityRoom){
        Set<House> arrayHouseQuantityRoomsMatches = new HashSet<>();
        for (int i = 0; i < houses.length; i++) {
            if (houses[i].quantityRoom == quantityRoom){
                arrayHouseQuantityRoomsMatches.add(houses[i]);
            }
        }
        return arrayHouseQuantityRoomsMatches;
    }

    public static Set<House> arrayHouseQuantityAndFloor(House[] houses, int quantityRoom, int floorFirstValue, int floorSecondValue){
        Set<House> arrayHouseQuantityAndFloorMatches = new HashSet<>();
        for (int i = 0; i < houses.length; i++) {
            if (houses[i].quantityRoom == quantityRoom && houses[i].floor >= floorFirstValue && houses[i].floor <= floorSecondValue){
                arrayHouseQuantityAndFloorMatches.add(houses[i]);
            }
        }
        return arrayHouseQuantityAndFloorMatches;
    }

    public static Set<House> arrayHouseWhichHaveMoreArea(House[] houses, int area){
        Set<House> arrayHouseWhichHaveMoreAreaMatches = new HashSet<>();
        for (int i = 0; i < houses.length; i++) {
            if (houses[i].area > area){
                arrayHouseWhichHaveMoreAreaMatches.add(houses[i]);
            }
        }
        return arrayHouseWhichHaveMoreAreaMatches;
    }
}