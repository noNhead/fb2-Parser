package org.sontoro.fb2_Parser.entity.description;

public class Author {
    private String firstName; //0-1 один обязательно при отсутствии <nickname>
    private String middleName; //0-1
    private String lastName; //0-1 один обязательно при отсутствии <nickname>
    private String nickname; //0-1 один обязательно при отсутствии <firstName> и <lastName>
    private String homepage; //0-n
    private String email; //0-n
    private String id; //0-1 с версии 2.2 идентификатор присваивается библиотекой

    public Author(String firstName, String lastName, String middleName, String nickname, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.nickname = nickname;
        this.email = email;
    }

    public Author() {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
