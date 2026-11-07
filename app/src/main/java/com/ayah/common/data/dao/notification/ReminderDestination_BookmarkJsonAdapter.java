package com.ayah.common.data.dao.notification;

import V8.d;
import com.ayah.common.data.dao.bookmark.BookmarkType;
import com.squareup.moshi.C;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.m;
import com.squareup.moshi.n;
import com.squareup.moshi.s;
import p120l9.t;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class ReminderDestination_BookmarkJsonAdapter extends JsonAdapter<ReminderDestination.Bookmark> {
    private final JsonAdapter<BookmarkType> bookmarkTypeAdapter;
    private final m options;

    public ReminderDestination_BookmarkJsonAdapter(C c10) {
        j.e(c10, "moshi");
        this.options = m.a("type");
        this.bookmarkTypeAdapter = c10.b(BookmarkType.class, t.f19442r, "type");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object a(n nVar) {
        j.e(nVar, "reader");
        nVar.e();
        BookmarkType bookmarkType = null;
        while (nVar.w()) {
            int iV = nVar.V(this.options);
            if (iV == -1) {
                nVar.b0();
                nVar.c0();
            } else if (iV == 0 && (bookmarkType = (BookmarkType) this.bookmarkTypeAdapter.a(nVar)) == null) {
                throw d.j("type", "type", nVar);
            }
        }
        nVar.n();
        if (bookmarkType != null) {
            return new ReminderDestination.Bookmark(bookmarkType);
        }
        throw d.e("type", "type", nVar);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void e(s sVar, Object obj) {
        ReminderDestination.Bookmark bookmark = (ReminderDestination.Bookmark) obj;
        j.e(sVar, "writer");
        if (bookmark == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        sVar.e();
        sVar.w("type");
        this.bookmarkTypeAdapter.e(sVar, bookmark.f13670a);
        sVar.i();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(50);
        sb.append("GeneratedJsonAdapter(ReminderDestination.Bookmark)");
        return sb.toString();
    }
}
