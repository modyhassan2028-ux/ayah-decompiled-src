package com.ayah.dao.backup;

import com.squareup.moshi.k;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
@k(generateAdapter = true)
public final class Note {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13734b;

    public Note(int i10, String str) {
        j.e(str, "text");
        this.f13733a = i10;
        this.f13734b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Note)) {
            return false;
        }
        Note note = (Note) obj;
        return this.f13733a == note.f13733a && j.a(this.f13734b, note.f13734b);
    }

    public final int hashCode() {
        return this.f13734b.hashCode() + (this.f13733a * 31);
    }

    public final String toString() {
        return "Note(index=" + this.f13733a + ", text=" + this.f13734b + ")";
    }
}
