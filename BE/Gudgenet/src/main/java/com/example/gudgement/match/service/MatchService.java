package com.example.gudgement.match.service;

import com.example.gudgement.match.dto.MatchDto;
import com.example.gudgement.member.entity.Member;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.Set;

public interface MatchService {
    void addUserToGroup(String room, String group, String user);

    void removeUserFromGroup(String room, String group, String user);

/*    void addUserToRoomAndTier(MatchDto matchDto);

    Set<String> getUsersInRoomAndTier(MatchDto matchDto);

    void removeUserFromRoomAndTier(MatchDto matchDto);

    long getUsersCountInRoomAndTier(String room, String tier);*/
}

