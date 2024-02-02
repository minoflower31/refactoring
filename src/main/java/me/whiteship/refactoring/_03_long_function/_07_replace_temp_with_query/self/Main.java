package me.whiteship.refactoring._03_long_function._07_replace_temp_with_query.self;

import java.util.Objects;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Member member1 = new Member();
        member1.setUserId("tester");
        member1.setUsername("park");
    }

    private static boolean isContainsNullField(Member obj) {
        return Stream.of(obj).allMatch(Objects::nonNull);
    }

    private static class Member {
        private String userId;
        private String username;
        private String password;
        private Boolean isHuman;
        private Integer loginFailCount;

        public Member() {
        }

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public Boolean getHuman() {
            return isHuman;
        }

        public void setIsHuman(Boolean human) {
            isHuman = human;
        }

        public int getLoginFailCount() {
            return loginFailCount;
        }

        public void setLoginFailCount(int loginFailCount) {
            this.loginFailCount = loginFailCount;
        }
    }
}
