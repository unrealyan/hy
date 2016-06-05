package com.tsfintech.aries.core.constant;

/**
 0-⾝份证；
 1-户⼝簿；
 2-护照；
 3-军官证；
 4-⼠兵证；
 5-港澳居民来往内地通⾏证；
 6-台湾同胞来往内地通⾏证；
 7-临时⾝份证；
 8-外国⼈居留证；
 9-警官证；
 A-⾹港⾝份证；
 B-澳⻔⾝份证；
 C-台湾⾝份证；
 X-其他证件
 */
public enum  IdType {

    ID_CARD("0"),

    HOUSEHOLD("1"),

    PASSPORT("2"),

    OFFICIAL_CARD("3"),

    SOLDIER_CARD("4"),

    EEP_TO_HK_MACAU("5"),

    EEP_TO_TW("6"),

    TEMPORARY_ID("7"),

    RESIDENCE_PERMIT("8"),

    POLICE_ID_CARD("9"),

    HK_ID_CARD("A"),

    MACAU_ID_CARD("B"),

    TW_ID_CARD("C"),

    OTHER("X");

    private String code;

    IdType(String code) {
        this.code = code;
    }
}
