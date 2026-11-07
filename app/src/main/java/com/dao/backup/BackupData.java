package com.ayah.dao.backup;

import com.squareup.moshi.k;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p120l9.r;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
@k(generateAdapter = true)
public final class BackupData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f13730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f13731b;

    public BackupData(List list, List list2) {
        j.e(list, "favorites");
        j.e(list2, "notes");
        this.f13730a = list;
        this.f13731b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BackupData)) {
            return false;
        }
        BackupData backupData = (BackupData) obj;
        return j.a(this.f13730a, backupData.f13730a) && j.a(this.f13731b, backupData.f13731b);
    }

    public final int hashCode() {
        return this.f13731b.hashCode() + (this.f13730a.hashCode() * 31);
    }

    public final String toString() {
        return "BackupData(favorites=" + this.f13730a + ", notes=" + this.f13731b + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ BackupData(List list, List list2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        int i11 = i10 & 1;
        r rVar = r.f19440r;
        this(i11 != 0 ? rVar : list, (i10 & 2) != 0 ? rVar : list2);
    }
}
