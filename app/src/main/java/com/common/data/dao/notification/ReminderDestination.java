package com.ayah.common.data.dao.notification;

import com.ayah.common.data.dao.bookmark.BookmarkType;
import com.squareup.moshi.k;

/* JADX INFO: loaded from: classes.dex */
@k(generateAdapter = true)
public abstract class ReminderDestination {

    @k(generateAdapter = true)
    public static final class Bookmark extends ReminderDestination {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BookmarkType f13670a;

        public Bookmark(BookmarkType bookmarkType) {
            super(0);
            this.f13670a = bookmarkType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Bookmark) && this.f13670a == ((Bookmark) obj).f13670a;
        }

        public final int hashCode() {
            return this.f13670a.hashCode();
        }

        public final String toString() {
            return "Bookmark(type=" + this.f13670a + ")";
        }
    }

    @k(generateAdapter = true)
    public static final class Sura extends ReminderDestination {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f13671a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f13672b;

        public Sura(int i10, int i11) {
            super(0);
            this.f13671a = i10;
            this.f13672b = i11;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Sura)) {
                return false;
            }
            Sura sura = (Sura) obj;
            return this.f13671a == sura.f13671a && this.f13672b == sura.f13672b;
        }

        public final int hashCode() {
            return (this.f13671a * 31) + this.f13672b;
        }

        public final String toString() {
            return "Sura(sura=" + this.f13671a + ", page=" + this.f13672b + ")";
        }
    }

    public /* synthetic */ ReminderDestination(int i10) {
        this();
    }

    private ReminderDestination() {
    }
}
