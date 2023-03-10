package com.kh.mango.follow.service.logic;

import com.kh.mango.follow.domain.Follow;
import com.kh.mango.follow.service.FollowService;
import com.kh.mango.follow.store.FollowStore;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FollowServiceImpl implements FollowService {

    @Autowired
    private SqlSession session;

    @Autowired
    FollowStore followStore;


    @Override
    public int followUser(Follow followUser) {
        int result = followStore.followUser(followUser);
        return result;
    }
}
