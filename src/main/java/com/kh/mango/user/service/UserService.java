package com.kh.mango.user.service;

import com.kh.mango.user.domain.Mypage;
import com.kh.mango.user.domain.User;

import java.util.List;

public interface UserService {

    User test();

    List<User> selectMember();

    Mypage mypageInfo();

    List<User> searchUser(String searchValue);
}
