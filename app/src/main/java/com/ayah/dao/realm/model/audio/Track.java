package com.ayah.dao.realm.model.audio;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.Index;
import io.realm.annotations.PrimaryKey;
import io.realm.com_ayah_dao_realm_model_audio_TrackRealmProxyInterface;
import io.realm.internal.RealmObjectProxy;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public class Track extends RealmObject implements com_ayah_dao_realm_model_audio_TrackRealmProxyInterface {

    @Index
    private long chapterNumber;
    private double endTime;
    private Reciter reciter;
    private double startTime;
    private RealmList<Timing> timings;

    @PrimaryKey
    private String trackID;
    private long version;

    /* JADX WARN: Multi-variable type inference failed */
    public Track() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$trackID("");
        realmSet$timings(new RealmList());
    }

    public final long getChapterNumber() {
        return realmGet$chapterNumber();
    }

    public final double getEndTime() {
        return realmGet$endTime();
    }

    public final Reciter getReciter() {
        return realmGet$reciter();
    }

    public final double getStartTime() {
        return realmGet$startTime();
    }

    public final RealmList<Timing> getTimings() {
        return realmGet$timings();
    }

    public final String getTrackID() {
        return realmGet$trackID();
    }

    public final long getVersion() {
        return realmGet$version();
    }

    @Override // io.realm.com_ayah_dao_realm_model_audio_TrackRealmProxyInterface
    public long realmGet$chapterNumber() {
        return this.chapterNumber;
    }

    @Override // io.realm.com_ayah_dao_realm_model_audio_TrackRealmProxyInterface
    public double realmGet$endTime() {
        return this.endTime;
    }

    @Override // io.realm.com_ayah_dao_realm_model_audio_TrackRealmProxyInterface
    public Reciter realmGet$reciter() {
        return this.reciter;
    }

    @Override // io.realm.com_ayah_dao_realm_model_audio_TrackRealmProxyInterface
    public double realmGet$startTime() {
        return this.startTime;
    }

    @Override // io.realm.com_ayah_dao_realm_model_audio_TrackRealmProxyInterface
    public RealmList realmGet$timings() {
        return this.timings;
    }

    @Override // io.realm.com_ayah_dao_realm_model_audio_TrackRealmProxyInterface
    public String realmGet$trackID() {
        return this.trackID;
    }

    @Override // io.realm.com_ayah_dao_realm_model_audio_TrackRealmProxyInterface
    public long realmGet$version() {
        return this.version;
    }

    @Override // io.realm.com_ayah_dao_realm_model_audio_TrackRealmProxyInterface
    public void realmSet$chapterNumber(long j) {
        this.chapterNumber = j;
    }

    @Override // io.realm.com_ayah_dao_realm_model_audio_TrackRealmProxyInterface
    public void realmSet$endTime(double d5) {
        this.endTime = d5;
    }

    @Override // io.realm.com_ayah_dao_realm_model_audio_TrackRealmProxyInterface
    public void realmSet$reciter(Reciter reciter) {
        this.reciter = reciter;
    }

    @Override // io.realm.com_ayah_dao_realm_model_audio_TrackRealmProxyInterface
    public void realmSet$startTime(double d5) {
        this.startTime = d5;
    }

    @Override // io.realm.com_ayah_dao_realm_model_audio_TrackRealmProxyInterface
    public void realmSet$timings(RealmList realmList) {
        this.timings = realmList;
    }

    @Override // io.realm.com_ayah_dao_realm_model_audio_TrackRealmProxyInterface
    public void realmSet$trackID(String str) {
        this.trackID = str;
    }

    @Override // io.realm.com_ayah_dao_realm_model_audio_TrackRealmProxyInterface
    public void realmSet$version(long j) {
        this.version = j;
    }

    public final void setChapterNumber(long j) {
        realmSet$chapterNumber(j);
    }

    public final void setEndTime(double d5) {
        realmSet$endTime(d5);
    }

    public final void setReciter(Reciter reciter) {
        realmSet$reciter(reciter);
    }

    public final void setStartTime(double d5) {
        realmSet$startTime(d5);
    }

    public final void setTimings(RealmList<Timing> realmList) {
        j.e(realmList, "<set-?>");
        realmSet$timings(realmList);
    }

    public final void setTrackID(String str) {
        j.e(str, "<set-?>");
        realmSet$trackID(str);
    }

    public final void setVersion(long j) {
        realmSet$version(j);
    }
}
