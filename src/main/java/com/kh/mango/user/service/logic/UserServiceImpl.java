package com.kh.mango.user.service.logic;

import com.kh.mango.user.domain.MyPage;
import com.kh.mango.user.domain.MyPageFollow;
import com.kh.mango.user.domain.MyPageDeals;
import com.kh.mango.user.domain.User;
import com.kh.mango.user.service.UserService;
import com.kh.mango.user.store.UserStore;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserStore uStore;
    @Autowired
    SqlSession session;

    @Override
    public User test() {
        return uStore.test();
    }

    @Override
    public int insertUser(User user) {
        int result = uStore.insertUser(session, user);
        return result;
    }

    @Override
    public User checkUserLogin(User user) {
        User uOne = uStore.checkUserLogin(session, user);
        return uOne;

    }

    @Override
    public List<User> searchUser(String searchValue) {
        List<User> searchList = uStore.searchUser(searchValue);
        return searchList;
    }

    @Override
    public List<MyPageFollow> myPageFollow(int userNo) {
        return uStore.selectMyPageFollower(userNo);
    }

    @Override
    public List<MyPageDeals> myPageDeals(int userNo) {
        return uStore.selectMyPageDeals(userNo);
    }

    @Override
    public List<User> selectMember() {
        List<User> userList = uStore.selectMember();
        return userList;
    }

    @Override
    public MyPage myPageInfo(int userNo) {
        return uStore.selectMyPageUser(userNo);
    }

}
