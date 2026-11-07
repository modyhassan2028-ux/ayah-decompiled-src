package com.ayah.common.data.source.json.model.booklist;

import H9.o;
import com.squareup.moshi.k;
import java.util.List;
import p245z2.a;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
@k(generateAdapter = true)
public final class BookCategory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f13683c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f13684d;

    public BookCategory(String str, String str2, String str3, List list) {
        j.e(str2, "title");
        this.f13681a = str;
        this.f13682b = str2;
        this.f13683c = list;
        this.f13684d = str3;
        o.r1(str, "-");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BookCategory)) {
            return false;
        }
        BookCategory bookCategory = (BookCategory) obj;
        return j.a(this.f13681a, bookCategory.f13681a) && j.a(this.f13682b, bookCategory.f13682b) && j.a(this.f13683c, bookCategory.f13683c) && j.a(this.f13684d, bookCategory.f13684d);
    }

    public final int hashCode() {
        int iHashCode = (this.f13683c.hashCode() + a.x(this.f13682b, this.f13681a.hashCode() * 31, 31)) * 31;
        String str = this.f13684d;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "BookCategory(id=" + this.f13681a + ", title=" + this.f13682b + ", books=" + this.f13683c + ", unavailableText=" + this.f13684d + ")";
    }
}
