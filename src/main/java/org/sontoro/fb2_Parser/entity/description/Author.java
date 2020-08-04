package org.sontoro.fb2_Parser.entity.description;

import java.util.List;

public class Author {
    private String firstName; //0-1 один обязательно при отсутствии <nickname>
    private String middleName; //0-1
    private String lastName; //0-1 один обязательно при отсутствии <nickname>
    private String nickname; //0-1 один обязательно при отсутствии <firstName> и <lastName>
    private List<String> homepage; //0-n
    private List<String> email; //0-n
    private String id; //0-1 с версии 2.2 идентификатор присваивается библиотекой

    public Author(String firstName, String middleName, String lastName, String nickname, List<String> homepage, List<String> email, String id) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.nickname = nickname;
        this.homepage = homepage;
        this.email = email;
        this.id = id;
    }

    public Author() {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public List<String> getHomepage() {
        return homepage;
    }

    public void setHomepage(List<String> homepage) {
        this.homepage = homepage;
    }

    public List<String> getEmail() {
        return email;
    }

    public void setEmail(List<String> email) {
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Author{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", nickname='" + nickname + '\'' +
                ", homepage=" + homepage +
                ", email=" + email +
                ", id='" + id + '\'' +
                '}';
    }
}
