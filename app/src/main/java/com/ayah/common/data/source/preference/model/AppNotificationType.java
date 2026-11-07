package com.ayah.common.data.source.preference.model;

import com.squareup.moshi.k;
import p179r9.a;
import p179r9.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
@k(generateAdapter = false)
public final class AppNotificationType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ AppNotificationType[] $VALUES;
    public static final AppNotificationType DAILY_READING;
    public static final AppNotificationType SURA_KAHF;
    public static final AppNotificationType VERSE_OF_THE_DAY;

    static {
        AppNotificationType appNotificationType = new AppNotificationType("DAILY_READING", 0);
        DAILY_READING = appNotificationType;
        AppNotificationType appNotificationType2 = new AppNotificationType("SURA_KAHF", 1);
        SURA_KAHF = appNotificationType2;
        AppNotificationType appNotificationType3 = new AppNotificationType("VERSE_OF_THE_DAY", 2);
        VERSE_OF_THE_DAY = appNotificationType3;
        AppNotificationType[] appNotificationTypeArr = {appNotificationType, appNotificationType2, appNotificationType3};
        $VALUES = appNotificationTypeArr;
        $ENTRIES = new b(appNotificationTypeArr);
    }

    public static AppNotificationType valueOf(String str) {
        return (AppNotificationType) Enum.valueOf(AppNotificationType.class, str);
    }

    public static AppNotificationType[] values() {
        return (AppNotificationType[]) $VALUES.clone();
    }
}
