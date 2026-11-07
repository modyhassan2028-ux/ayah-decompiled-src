package com.ayah.dao.realm.model.audio;

import io.realm.RealmObject;
import io.realm.com_ayah_dao_realm_model_audio_TimingRealmProxyInterface;
import io.realm.internal.RealmObjectProxy;

/* JADX INFO: loaded from: classes.dex */
public class Timing extends RealmObject implements com_ayah_dao_realm_model_audio_TimingRealmProxyInterface {
    private double startTime;
    private long verseID;

    /* JADX WARN: Multi-variable type inference failed */
    public Timing() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public final double getStartTime() {
        return realmGet$startTime();
    }

    public final long getVerseID() {
        return realmGet$verseID();
    }

    @Override // io.realm.com_ayah_dao_realm_model_audio_TimingRealmProxyInterface
    public double realmGet$startTime() {
        return this.startTime;
    }

    @Override // io.realm.com_ayah_dao_realm_model_audio_TimingRealmProxyInterface
    public long realmGet$verseID() {
        return this.verseID;
    }

    @Override // io.realm.com_ayah_dao_realm_model_audio_TimingRealmProxyInterface
    public void realmSet$startTime(double d5) {
        this.startTime = d5;
    }

    @Override // io.realm.com_ayah_dao_realm_model_audio_TimingRealmProxyInterface
    public void realmSet$verseID(long j) {
        this.verseID = j;
    }

    public final void setStartTime(double d5) {
        realmSet$startTime(d5);
    }

    public final void setVerseID(long j) {
        realmSet$verseID(j);
    }
}
