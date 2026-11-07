package com.ayah.dao.backup;

import com.squareup.moshi.k;
import p245z2.a;

/* JADX INFO: loaded from: classes.dex */
@k(generateAdapter = true)
public final class Favorite {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13732a;

    public Favorite(int i10) {
        this.f13732a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Favorite) && this.f13732a == ((Favorite) obj).f13732a;
    }

    public final int hashCode() {
        return this.f13732a;
    }

    public final String toString() {
        return a.B(this.f13732a, "Favorite(index=", ")");
    }
}
