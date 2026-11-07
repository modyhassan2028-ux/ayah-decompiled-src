package com.ayah.common.data.source.json.model;

import com.squareup.moshi.k;
import p123m2.c;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
@k(generateAdapter = true)
public final class ChapterText {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13677b;

    public ChapterText(String str, String str2) {
        this.f13676a = str;
        this.f13677b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChapterText)) {
            return false;
        }
        ChapterText chapterText = (ChapterText) obj;
        return j.a(this.f13676a, chapterText.f13676a) && j.a(this.f13677b, chapterText.f13677b);
    }

    public final int hashCode() {
        return this.f13677b.hashCode() + (this.f13676a.hashCode() * 31);
    }

    public final String toString() {
        return c.t("ChapterText(title=", this.f13676a, ", body=", this.f13677b, ")");
    }
}
