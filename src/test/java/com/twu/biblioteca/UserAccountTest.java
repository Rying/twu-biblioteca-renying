package com.twu.biblioteca;

import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class UserAccountTest {
    UserAccount userAccount;

    @Before
    public void setUp() throws Exception {
        userAccount = new UserAccount("username", "password", "email@test.com", "88+123 4567 8900");
    }

    @Test
    public void should_user_use_error_account_info_log_in_false() {

        assertThat(userAccount.logIn("errorName", "errorPassword"), is(false));
    }

    @Test
    public void should_user_use_correct_name_and_password_log_in_return_true() {

        assertThat(userAccount.logIn("username", "password"), is(true));
    }

    @Test
    public void should_user_get_account_infomation_when_log_in() {
        userAccount.setLogInStatus(true);

        assertThat(userAccount.getAccountInfo(), is("name: username\t" +
                "email: email@test.com\t" +
                "phone: 88+123 4567 8900\n"));
    }
}