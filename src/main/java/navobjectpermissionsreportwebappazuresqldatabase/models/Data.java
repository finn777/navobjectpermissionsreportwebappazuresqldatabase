package navobjectpermissionsreportwebappazuresqldatabase.models;

import javax.persistence.*;
import java.util.ArrayList;

/*
existing table:

CREATE TABLE [dbo].[data](
	[dataid] [int] IDENTITY(1,1) NOT NULL,
	[modulename] [varchar](80) NULL,
	[objecttype] [varchar](80) NULL,
	[description] [varchar](80) NULL,
	[rangefrom] [bigint] NULL,
	[rangeto] [bigint] NULL,
	[pread] [varchar](10) NULL,
	[pinsert] [varchar](10) NULL,
	[pmodify] [varchar](10) NULL,
	[pdelete] [varchar](10) NULL,
	[pexecute] [varchar](10) NULL,
	[productline] [varchar](80) NULL,
	[moduleid] [bigint] NULL,
	[versionname] [varchar](20) NULL,
	[moduleid2] [bigint] NULL,
 CONSTRAINT [PK_data] PRIMARY KEY CLUSTERED
(
	[dataid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON)
)
*/


@Entity
@Table(name = "data")
public class Data {

  // ------------------------
  // PRIVATE FIELDS
  // ------------------------
  

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long dataid;
  private String modulename;
  private String objecttype;
  private String description;
  private Long rangefrom;
  private Long rangeto;
  private String pread;
  private String pinsert;
  private String pmodify;
  private String pdelete;
  private String pexecute;
  private String productline;
  private Long moduleid;
  private String versionname;
  private Long moduleid2;


  // ------------------------
  // PUBLIC METHODS
  // ------------------------
  
  public Data() { }

  public Data(long dataid) {
    this.dataid = dataid;
  }

  public Data(String modulename, String objecttype, String description, Long rangefrom, Long rangeto, String pread, String pinsert, String pmodify, String pdelete, String pexecute, String productline, Long moduleid, String versionname, Long moduleid2) {
    this.modulename = modulename;
    this.objecttype = objecttype;
    this.description = description;
    this.rangefrom = rangefrom;
    this.rangeto = rangeto;
    this.pread = pread;
    this.pinsert = pinsert;
    this.pmodify = pmodify;
    this.pdelete = pdelete;
    this.pexecute = pexecute;
    this.productline = productline;
    this.moduleid = moduleid;
    this.versionname = versionname;
    this.moduleid2 = moduleid2;
  }

    public ArrayList<String> getTypes() {
        ArrayList<String> Types = new ArrayList<String>();

        Types.add("TableData");
        Types.add("TableDescription");
        Types.add("Form");
        Types.add("Report");
        Types.add("Dataport");
        Types.add("XMLport");
        Types.add("Codeunit");
        Types.add("MenuSuite");
        Types.add("Page");

        return Types;
    }

// Getter and setter methods


  public Long getDataid() {
    return dataid;
  }

  public void setDataid(Long dataid) {
    this.dataid = dataid;
  }

  public String getModulename() {
    return modulename;
  }

  public void setModulename(String modulename) {
    this.modulename = modulename;
  }

  public String getObjecttype() {
    return objecttype;
  }

  public void setObjecttype(String objecttype) {
    this.objecttype = objecttype;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Long getRangefrom() {
    return rangefrom;
  }

  public void setRangefrom(Long rangefrom) {
    this.rangefrom = rangefrom;
  }

  public Long getRangeto() {
    return rangeto;
  }

  public void setRangeto(Long rangeto) {
    this.rangeto = rangeto;
  }

  public String getPread() {
    return pread;
  }

  public void setPread(String pread) {
    this.pread = pread;
  }

  public String getPinsert() {
    return pinsert;
  }

  public void setPinsert(String pinsert) {
    this.pinsert = pinsert;
  }

  public String getPmodify() {
    return pmodify;
  }

  public void setPmodify(String pmodify) {
    this.pmodify = pmodify;
  }

  public String getPdelete() {
    return pdelete;
  }

  public void setPdelete(String pdelete) {
    this.pdelete = pdelete;
  }

  public String getPexecute() {
    return pexecute;
  }

  public void setPexecute(String pexecute) {
    this.pexecute = pexecute;
  }

  public String getProductline() {
    return productline;
  }

  public void setProductline(String productline) {
    this.productline = productline;
  }

  public Long getModuleid() {
    return moduleid;
  }

  public void setModuleid(Long moduleid) {
    this.moduleid = moduleid;
  }

  public String getVersionname() {
    return versionname;
  }

  public void setVersionname(String versionname) {
    this.versionname = versionname;
  }

  public Long getModuleid2() {
    return moduleid2;
  }

  public void setModuleid2(Long moduleid2) {
    this.moduleid2 = moduleid2;
  }
} // class Data
