package com.ayah.common.data.source.json.model.booklist;

import H9.o;
import H9.v;
import android.content.res.Resources;
import android.support.v4.media.session.p;
import com.squareup.moshi.k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p125m4.b;
import p245z2.a;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
@k(generateAdapter = true)
public final class BookType {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f13687c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f13688d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f13689e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f13690f;
    public final String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f13691h;

    public BookType(String str, String str2, String str3, String str4, boolean z10, boolean z11, String str5) {
        j.e(str, "id");
        j.e(str2, "date");
        j.e(str3, "title");
        j.e(str4, "subtitle");
        this.f13685a = str;
        this.f13686b = str2;
        this.f13687c = str3;
        this.f13688d = str4;
        this.f13689e = z10;
        this.f13690f = z11;
        this.g = str5;
        String strR1 = o.r1(str, "-");
        if (!j.a(Resources.getSystem().getConfiguration().locale.getLanguage(), strR1) && (!strR1.equals("ar") || !b.b())) {
            if (v.R0(str, "ar-", false)) {
                str3 = str3.concat(" (العربية)");
            } else {
                str3 = str3 + " " + str4;
            }
        }
        this.f13691h = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BookType)) {
            return false;
        }
        BookType bookType = (BookType) obj;
        return j.a(this.f13685a, bookType.f13685a) && j.a(this.f13686b, bookType.f13686b) && j.a(this.f13687c, bookType.f13687c) && j.a(this.f13688d, bookType.f13688d) && this.f13689e == bookType.f13689e && this.f13690f == bookType.f13690f && j.a(this.g, bookType.g);
    }

    public final int hashCode() {
        int iX = (((a.x(this.f13688d, a.x(this.f13687c, a.x(this.f13686b, this.f13685a.hashCode() * 31, 31), 31), 31) + (this.f13689e ? 1231 : 1237)) * 31) + (this.f13690f ? 1231 : 1237)) * 31;
        String str = this.g;
        return iX + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BookType(id=");
        sb.append(this.f13685a);
        sb.append(", date=");
        sb.append(this.f13686b);
        sb.append(", title=");
        a.I(sb, this.f13687c, ", subtitle=", this.f13688d, ", isConcise=");
        sb.append(this.f13689e);
        sb.append(", isHidden=");
        sb.append(this.f13690f);
        sb.append(", footnotePattern=");
        return p.B(sb, this.g, ")");
    }

    public /* synthetic */ BookType(String str, String str2, String str3, String str4, boolean z10, boolean z11, String str5, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, z10, (i10 & 32) != 0 ? false : z11, str5);
    }
}
