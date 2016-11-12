package hubs;

import java.util.Set;

public interface ChatPage {
    public void userJoined(String username, String email, String cgu, String category);
    public void sendMessage(String username, String message);
    public void sendMessageText(String username, String email, String category);
    public void userList(Set<String> users);
    public void userLeftRoom(String username);
    public void userJoinedRoom(String username);
    public void roomList(Set<String> rooms);
}