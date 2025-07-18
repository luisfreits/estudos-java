package model;

public class RoomManager {
    private String name;
    private String email;
    private int room;

    public RoomManager(String name, String email, int room){
        this.email = email;
        this.name = name;
        this.room = room;
        return;
    }

    public String toString() {
        return String.format("%d: %s, %s", room, name, email);
    }
}