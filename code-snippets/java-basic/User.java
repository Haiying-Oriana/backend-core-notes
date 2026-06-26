/**
 * Java basic entity demo with English comment
 */
public class User {
    // User unique id
    private Long id;
    // User login name
    private String username;

    // No-arg constructor
    public User() {}

    // Full arg constructor
    public User(Long id, String username) {
        this.id = id;
        this.username = username;
    }

    // Getter and Setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}