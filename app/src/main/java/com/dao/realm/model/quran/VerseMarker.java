package com.ayah.dao.realm.model.quran;

import io.realm.RealmObject;
import io.realm.com_ayah_dao_realm_model_quran_VerseMarkerRealmProxyInterface;
import io.realm.internal.RealmObjectProxy;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public class VerseMarker extends RealmObject implements com_ayah_dao_realm_model_quran_VerseMarkerRealmProxyInterface {
    private float centerX;
    private float centerY;
    private long line;
    private String numberCodePoint;

    /* JADX WARN: Multi-variable type inference failed */
    public VerseMarker() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$numberCodePoint("");
    }

    public final float getCenterX() {
        return realmGet$centerX();
    }

    public final float getCenterY() {
        return realmGet$centerY();
    }

    public final long getLine() {
        return realmGet$line();
    }

    public final String getNumberCodePoint() {
        return realmGet$numberCodePoint();
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_VerseMarkerRealmProxyInterface
    public float realmGet$centerX() {
        return this.centerX;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_VerseMarkerRealmProxyInterface
    public float realmGet$centerY() {
        return this.centerY;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_VerseMarkerRealmProxyInterface
    public long realmGet$line() {
        return this.line;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_VerseMarkerRealmProxyInterface
    public String realmGet$numberCodePoint() {
        return this.numberCodePoint;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_VerseMarkerRealmProxyInterface
    public void realmSet$centerX(float f3) {
        this.centerX = f3;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_VerseMarkerRealmProxyInterface
    public void realmSet$centerY(float f3) {
        this.centerY = f3;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_VerseMarkerRealmProxyInterface
    public void realmSet$line(long j) {
        this.line = j;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_VerseMarkerRealmProxyInterface
    public void realmSet$numberCodePoint(String str) {
        this.numberCodePoint = str;
    }

    public final void setCenterX(float f3) {
        realmSet$centerX(f3);
    }

    public final void setCenterY(float f3) {
        realmSet$centerY(f3);
    }

    public final void setLine(long j) {
        realmSet$line(j);
    }

    public final void setNumberCodePoint(String str) {
        j.e(str, "<set-?>");
        realmSet$numberCodePoint(str);
    }
}
