package com.example.gudgement.shop.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

/*
*   에러 종류별 구분
* */

@Getter
public enum ItemErrorCode {
    // 아이템
    NOT_FOUND_ITEM(HttpStatus.NOT_FOUND, "I-001", "존재하지 않는 아이템입니다."),
    // 인벤토리
    NOT_AUTHORIZATION_TOKEN(HttpStatus.BAD_REQUEST, "T-001", "올바른 토큰이 아닙니다."),
    ACCESS_TOKEN_EXPIRATION(HttpStatus.UNAUTHORIZED, "T-002", "Access토큰의 기간이 만료되었습니다."),
    REFRESH_TOKEN_EXPIRATION(HttpStatus.UNAUTHORIZED, "T-003-", "Refresh토큰의 기간이 만료되었습니다."),
    NOT_EXIST_TOKEN(HttpStatus.BAD_REQUEST, "T-004", "토큰이 없습니다."),
    NOT_SAME_TOKEN_AND_MEMBER(HttpStatus.BAD_REQUEST, "T-005", "토큰에 담긴 유저와 토큰을 보낸 유저가 같지 않습니다."),
    
    // 이메일
    UNABLE_TO_SEND_EMAIL(HttpStatus.BAD_REQUEST, "E-001", "이메일 송신 에러입니다."),
    DUPLICATION_EMAIL(HttpStatus.BAD_REQUEST, "E-002", "중복된 이메일입니다."),
    NOT_AUTHORIZATION_EMAIL(HttpStatus.BAD_REQUEST, "E-003", "이메일이 인증되지 않은 유저입니다."),

    // appPush
    FAIL_TO_SEND_MESSAGE(HttpStatus.BAD_REQUEST, "F-001", "FCM Push에 실패하였습니다."),
    NOT_REGISTRATION_FCM_TOKEN(HttpStatus.NOT_FOUND, "F-002", "Fcm 토큰이 존재하지 않습니다."),

    // account
    NOT_FOUND_ACCOUNT(HttpStatus.BAD_REQUEST, "A-001", "존재하지 않는 계좌입니다."),
    AMOUNT_NOT_NUMBER(HttpStatus.BAD_REQUEST, "A-002", "계좌 거래금액이 숫자형이 아닙니다.");

    private HttpStatus httpStatus;
    private String errorCode;
    private String message;

    ItemErrorCode(HttpStatus httpStatus, String errorCode, String message) {
        this.httpStatus = httpStatus;
        this.errorCode = errorCode;
        this.message = message;
    }
}