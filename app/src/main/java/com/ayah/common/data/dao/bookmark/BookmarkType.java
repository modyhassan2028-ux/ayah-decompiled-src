package com.ayah.common.data.dao.bookmark;

import com.squareup.moshi.k;
import p179r9.a;
import p179r9.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
@k(generateAdapter = false)
public final class BookmarkType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ BookmarkType[] $VALUES;
    public static final BookmarkType BLUE;
    public static final BookmarkType GREEN;
    public static final BookmarkType ORANGE;
    public static final BookmarkType PURPLE;
    public static final BookmarkType RED;
    public static final BookmarkType YELLOW;

    static {
        BookmarkType bookmarkType = new BookmarkType("RED", 0);
        RED = bookmarkType;
        BookmarkType bookmarkType2 = new BookmarkType("YELLOW", 1);
        YELLOW = bookmarkType2;
        BookmarkType bookmarkType3 = new BookmarkType("GREEN", 2);
        GREEN = bookmarkType3;
        BookmarkType bookmarkType4 = new BookmarkType("BLUE", 3);
        BLUE = bookmarkType4;
        BookmarkType bookmarkType5 = new BookmarkType("ORANGE", 4);
        ORANGE = bookmarkType5;
        BookmarkType bookmarkType6 = new BookmarkType("PURPLE", 5);
        PURPLE = bookmarkType6;
        BookmarkType[] bookmarkTypeArr = {bookmarkType, bookmarkType2, bookmarkType3, bookmarkType4, bookmarkType5, bookmarkType6};
        $VALUES = bookmarkTypeArr;
        $ENTRIES = new b(bookmarkTypeArr);
    }

    public static BookmarkType valueOf(String str) {
        return (BookmarkType) Enum.valueOf(BookmarkType.class, str);
    }

    public static BookmarkType[] values() {
        return (BookmarkType[]) $VALUES.clone();
    }
}
