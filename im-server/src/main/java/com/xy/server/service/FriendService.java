package com.xy.server.service;

import com.xy.server.domain.dto.FriendDto;
import com.xy.server.domain.dto.FriendRequestDto;
import com.xy.server.domain.dto.FriendshipRequestDto;
import com.xy.server.domain.vo.FriendVo;
import com.xy.server.domain.vo.FriendshipRequestVo;

import java.util.List;


public interface FriendService {

    List<FriendVo> list(String user_id, String sequence);

    FriendVo findFriend(FriendDto friendDto);

    void addFriend(FriendRequestDto friendRequestDto);

    void approveFriend(FriendshipRequestDto friendshipRequestDto);

    List<FriendshipRequestVo> request(String user_id);

    void delFriend(FriendDto friendDto);
}