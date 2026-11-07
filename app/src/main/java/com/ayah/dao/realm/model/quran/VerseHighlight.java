package com.ayah.dao.realm.model.quran;

import io.realm.RealmObject;
import io.realm.com_ayah_dao_realm_model_quran_VerseHighlightRealmProxyInterface;
import io.realm.internal.RealmObjectProxy;

/* JADX INFO: loaded from: classes.dex */
public class VerseHighlight extends RealmObject implements com_ayah_dao_realm_model_quran_VerseHighlightRealmProxyInterface {
    private float left;
    private long line;
    private float right;

    /* JADX WARN: Multi-variable type inference failed */
    public VerseHighlight() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public final float getLeft() {
        return realmGet$left();
    }

    public final long getLine() {
        return realmGet$line();
    }

    public final float getRight() {
        return realmGet$right();
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_VerseHighlightRealmProxyInterface
    public float realmGet$left() {
        return this.left;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_VerseHighlightRealmProxyInterface
    public long realmGet$line() {
        return this.line;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_VerseHighlightRealmProxyInterface
    public float realmGet$right() {
        return this.right;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_VerseHighlightRealmProxyInterface
    public void realmSet$left(float f3) {
        this.left = f3;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_VerseHighlightRealmProxyInterface
    public void realmSet$line(long j) {
        this.line = j;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_VerseHighlightRealmProxyInterface
    public void realmSet$right(float f3) {
        this.right = f3;
    }

    public final void setLeft(float f3) {
        realmSet$left(f3);
    }

    public final void setLine(long j) {
        realmSet$line(j);
    }

    public final void setRight(float f3) {
        realmSet$right(f3);
    }
}
