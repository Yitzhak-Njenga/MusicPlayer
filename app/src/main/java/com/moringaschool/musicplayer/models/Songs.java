
package com.moringaschool.musicplayer.models;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.moringaschool.musicplayer.Tracks;

public class Songs implements Serializable
{

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("upc")
    @Expose
    private String upc;
    @SerializedName("link")
    @Expose
    private String link;
    @SerializedName("share")
    @Expose
    private String share;
    @SerializedName("cover")
    @Expose
    private String cover;
    @SerializedName("cover_small")
    @Expose
    private String coverSmall;
    @SerializedName("cover_medium")
    @Expose
    private String coverMedium;
    @SerializedName("cover_big")
    @Expose
    private String coverBig;
    @SerializedName("cover_xl")
    @Expose
    private String coverXl;
    @SerializedName("md5_image")
    @Expose
    private String md5Image;
    @SerializedName("genre_id")
    @Expose
    private Integer genreId;
    @SerializedName("genres")
    @Expose
    private Genres genres;
    @SerializedName("label")
    @Expose
    private String label;
    @SerializedName("nb_tracks")
    @Expose
    private Integer nbTracks;
    @SerializedName("duration")
    @Expose
    private Integer duration;
    @SerializedName("fans")
    @Expose
    private Integer fans;
    @SerializedName("rating")
    @Expose
    private Integer rating;
    @SerializedName("release_date")
    @Expose
    private String releaseDate;
    @SerializedName("record_type")
    @Expose
    private String recordType;
    @SerializedName("available")
    @Expose
    private Boolean available;
    @SerializedName("tracklist")
    @Expose
    private String tracklist;
    @SerializedName("explicit_lyrics")
    @Expose
    private Boolean explicitLyrics;
    @SerializedName("explicit_content_lyrics")
    @Expose
    private Integer explicitContentLyrics;
    @SerializedName("explicit_content_cover")
    @Expose
    private Integer explicitContentCover;
    @SerializedName("contributors")
    @Expose
    private List<Contributor> contributors = null;
    @SerializedName("artist")
    @Expose
    private Artist artist;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("tracks")
    @Expose
    private Tracks tracks;
    private final static long serialVersionUID = 8325759311866966130L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Songs() {
    }

    /**
     * 
     * @param genreId
     * @param coverBig
     * @param artist
     * @param link
     * @param rating
     * @param available
     * @param md5Image
     * @param title
     * @param type
     * @param cover
     * @param coverSmall
     * @param duration
     * @param genres
     * @param coverMedium
     * @param share
     * @param id
     * @param explicitContentCover
     * @param tracklist
     * @param releaseDate
     * @param recordType
     * @param explicitContentLyrics
     * @param upc
     * @param coverXl
     * @param label
     * @param tracks
     * @param fans
     * @param nbTracks
     * @param explicitLyrics
     * @param contributors
     */
    public Songs(Integer id, String title, String upc, String link, String share, String cover, String coverSmall, String coverMedium, String coverBig, String coverXl, String md5Image, Integer genreId, Genres genres, String label, Integer nbTracks, Integer duration, Integer fans, Integer rating, String releaseDate, String recordType, Boolean available, String tracklist, Boolean explicitLyrics, Integer explicitContentLyrics, Integer explicitContentCover, List<Contributor> contributors, Artist artist, String type, Tracks tracks) {
        super();
        this.id = id;
        this.title = title;
        this.upc = upc;
        this.link = link;
        this.share = share;
        this.cover = cover;
        this.coverSmall = coverSmall;
        this.coverMedium = coverMedium;
        this.coverBig = coverBig;
        this.coverXl = coverXl;
        this.md5Image = md5Image;
        this.genreId = genreId;
        this.genres = genres;
        this.label = label;
        this.nbTracks = nbTracks;
        this.duration = duration;
        this.fans = fans;
        this.rating = rating;
        this.releaseDate = releaseDate;
        this.recordType = recordType;
        this.available = available;
        this.tracklist = tracklist;
        this.explicitLyrics = explicitLyrics;
        this.explicitContentLyrics = explicitContentLyrics;
        this.explicitContentCover = explicitContentCover;
        this.contributors = contributors;
        this.artist = artist;
        this.type = type;
        this.tracks = tracks;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUpc() {
        return upc;
    }

    public void setUpc(String upc) {
        this.upc = upc;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getShare() {
        return share;
    }

    public void setShare(String share) {
        this.share = share;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getCoverSmall() {
        return coverSmall;
    }

    public void setCoverSmall(String coverSmall) {
        this.coverSmall = coverSmall;
    }

    public String getCoverMedium() {
        return coverMedium;
    }

    public void setCoverMedium(String coverMedium) {
        this.coverMedium = coverMedium;
    }

    public String getCoverBig() {
        return coverBig;
    }

    public void setCoverBig(String coverBig) {
        this.coverBig = coverBig;
    }

    public String getCoverXl() {
        return coverXl;
    }

    public void setCoverXl(String coverXl) {
        this.coverXl = coverXl;
    }

    public String getMd5Image() {
        return md5Image;
    }

    public void setMd5Image(String md5Image) {
        this.md5Image = md5Image;
    }

    public Integer getGenreId() {
        return genreId;
    }

    public void setGenreId(Integer genreId) {
        this.genreId = genreId;
    }

    public Genres getGenres() {
        return genres;
    }

    public void setGenres(Genres genres) {
        this.genres = genres;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Integer getNbTracks() {
        return nbTracks;
    }

    public void setNbTracks(Integer nbTracks) {
        this.nbTracks = nbTracks;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Integer getFans() {
        return fans;
    }

    public void setFans(Integer fans) {
        this.fans = fans;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getRecordType() {
        return recordType;
    }

    public void setRecordType(String recordType) {
        this.recordType = recordType;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public String getTracklist() {
        return tracklist;
    }

    public void setTracklist(String tracklist) {
        this.tracklist = tracklist;
    }

    public Boolean getExplicitLyrics() {
        return explicitLyrics;
    }

    public void setExplicitLyrics(Boolean explicitLyrics) {
        this.explicitLyrics = explicitLyrics;
    }

    public Integer getExplicitContentLyrics() {
        return explicitContentLyrics;
    }

    public void setExplicitContentLyrics(Integer explicitContentLyrics) {
        this.explicitContentLyrics = explicitContentLyrics;
    }

    public Integer getExplicitContentCover() {
        return explicitContentCover;
    }

    public void setExplicitContentCover(Integer explicitContentCover) {
        this.explicitContentCover = explicitContentCover;
    }

    public List<Contributor> getContributors() {
        return contributors;
    }

    public void setContributors(List<Contributor> contributors) {
        this.contributors = contributors;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Tracks getTracks() {
        return tracks;
    }

    public void setTracks(Tracks tracks) {
        this.tracks = tracks;
    }

}
