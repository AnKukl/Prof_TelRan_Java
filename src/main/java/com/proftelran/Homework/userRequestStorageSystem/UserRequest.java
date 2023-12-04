package com.proftelran.Homework.userRequestStorageSystem;

public class UserRequest {
    private User user;

    public UserRequest(User user) {
        this.user = user;

    }

    private Answers answer;
    private String address;

    public Answers getAnswer() {
        return this.answer;
    }

    public void setAnswer(Answers answer) {
        this.answer = answer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAnswer(String address, User user) {
        this.user = user;
        if (address.contains("www")) {
            user.setAbility(true);
        } else user.setAbility(false);
        if (user.isAbility() && !"".equals(getAddress())) {
            setAnswer(Answers.APPROVED);
            return getAddress() + " [ " + getAnswer().toString() + " ]";

        }
        if (!user.isAbility() && !"".equals(getAddress())) {
            setAnswer(Answers.DENIED);
            return getAddress() + " [ " + getAnswer().toString() + " ]";

        } else setAnswer(Answers.ERROR);
        return getAddress() + " [ " + getAnswer().toString() + " ]";
    }

    @Override
    public String toString() {
        return getAnswer(getAddress(), this.user);
    }
}
