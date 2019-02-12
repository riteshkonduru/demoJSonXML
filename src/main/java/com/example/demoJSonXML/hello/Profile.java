package com.example.demoJSonXML.hello;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "Profile") public final class Profile {
	
	@JacksonXmlElementWrapper(localName = "classAccesses", useWrapping = false)
	public List<ClassAccesses> classAccesses; //Need
	
	@JacksonXmlElementWrapper(localName = "pageAccesses", useWrapping = false)
	public List<PageAccesses> pageAccesses; //Need
	
	@JacksonXmlElementWrapper(localName = "userPermissions", useWrapping = false)
	public List<UserPermissions> userPermissions; //Need
	
	@JacksonXmlProperty(localName = "custom", isAttribute = true)
	public boolean custom; //Need
	
	@JacksonXmlProperty(localName = "userLicense", isAttribute = true)
	public String userLicense; //Need
	
	@JacksonXmlProperty(localName = "fullName", isAttribute = true)
	public String fullName; //Need
	
	@JacksonXmlProperty(localName = "description", isAttribute = true)
	public String description; // not Need
	
	@JacksonXmlElementWrapper(localName = "tabVisibilities", useWrapping = false)
	public List<TabVisibilities> tabVisibilities; //Need
	
	@JacksonXmlElementWrapper(localName = "recordTypeVisibilities", useWrapping = false)
	public List<RecordTypeVisibilities> recordTypeVisibilities; //Need
	
	@JacksonXmlElementWrapper(localName = "profileActionOverrides", useWrapping = false)
	public List<ProfileActionOverrides> profileActionOverrides;
	
	@JacksonXmlElementWrapper(localName = "objectPermissions", useWrapping = false)
	public List<ObjectPermissions> objectPermissions;//Need
	
	@JacksonXmlElementWrapper(localName = "loginIpRanges", useWrapping = false)
	public List<LoginIpRanges> loginIpRanges;
	
	@JacksonXmlElementWrapper(localName = "loginHours", useWrapping = false)
	public List<LoginHours> loginHours;
	
	@JacksonXmlElementWrapper(localName = "layoutAssignments", useWrapping = false)
	public List<LayoutAssignments> layoutAssignments;//Need
	
	@JacksonXmlElementWrapper(localName = "fieldPermissions", useWrapping = false)
	public List<FieldPermissions> fieldPermissions;//Need
	
	@JacksonXmlElementWrapper(localName = "fieldLevelSecurities", useWrapping = false)
	public List<FieldLevelSecurities> fieldLevelSecurities;//Need
	
	@JacksonXmlElementWrapper(localName = "externalDataSourceAccesses", useWrapping = false)
	public List<ExternalDataSourceAccesses> externalDataSourceAccesses;
	
	@JacksonXmlElementWrapper(localName = "customPermissions", useWrapping = false)
	public List<CustomPermissions> customPermissions;//Need
	
	@JacksonXmlElementWrapper(localName = "categoryGroupVisibilities", useWrapping = false)
	public List<CategoryGroupVisibilities> categoryGroupVisibilities;
	
	@JacksonXmlElementWrapper(localName = "applicationVisibilities", useWrapping = false)
	public List<ApplicationVisibilities> applicationVisibilities;
	
	public Profile() {
		
	}
	
	public Profile(List<ClassAccesses> classAccesses, List<PageAccesses> pageAccesses,
			List<UserPermissions> userPermissions, boolean custom, String userLicense, String fullName,
			String description, List<TabVisibilities> tabVisibilities,
			List<RecordTypeVisibilities> recordTypeVisibilities, List<ProfileActionOverrides> profileActionOverrides,
			List<ObjectPermissions> objectPermissions, List<LoginIpRanges> loginIpRanges, List<LoginHours> loginHours,
			List<LayoutAssignments> layoutAssignments, List<FieldPermissions> fieldPermissions,
			List<FieldLevelSecurities> fieldLevelSecurities,
			List<ExternalDataSourceAccesses> externalDataSourceAccesses, List<CustomPermissions> customPermissions,
			List<CategoryGroupVisibilities> categoryGroupVisibilities,
			List<ApplicationVisibilities> applicationVisibilities) {

		this.classAccesses = classAccesses;
		this.pageAccesses = pageAccesses;
		this.userPermissions = userPermissions;
		this.custom = custom;
		this.userLicense = userLicense;
		this.fullName = fullName;
		this.description = description;
		this.tabVisibilities = tabVisibilities;
		this.recordTypeVisibilities = recordTypeVisibilities;
		this.profileActionOverrides = profileActionOverrides;
		this.objectPermissions = objectPermissions;
		this.loginIpRanges = loginIpRanges;
		this.loginHours = loginHours;
		this.layoutAssignments = layoutAssignments;
		this.fieldPermissions = fieldPermissions;
		this.fieldLevelSecurities = fieldLevelSecurities;
		this.externalDataSourceAccesses = externalDataSourceAccesses;
		this.customPermissions = customPermissions;
		this.categoryGroupVisibilities = categoryGroupVisibilities;
		this.applicationVisibilities = applicationVisibilities;
	}
	public List<ClassAccesses> getClassAccesses() {
		return classAccesses;
	}

	public void setClassAccesses(List<ClassAccesses> classAccesses) {
		this.classAccesses = classAccesses;
	}

	public List<PageAccesses> getPageAccesses() {
		return pageAccesses;
	}

	public void setPageAccesses(List<PageAccesses> pageAccesses) {
		this.pageAccesses = pageAccesses;
	}

	public List<UserPermissions> getUserPermissions() {
		return userPermissions;
	}

	public void setUserPermissions(List<UserPermissions> userPermissions) {
		this.userPermissions = userPermissions;
	}

	public boolean isCustom() {
		return custom;
	}

	public void setCustom(boolean custom) {
		this.custom = custom;
	}

	public String getUserLicense() {
		return userLicense;
	}

	public void setUserLicense(String userLicense) {
		this.userLicense = userLicense;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<TabVisibilities> getTabVisibilities() {
		return tabVisibilities;
	}

	public void setTabVisibilities(List<TabVisibilities> tabVisibilities) {
		this.tabVisibilities = tabVisibilities;
	}

	public List<RecordTypeVisibilities> getRecordTypeVisibilities() {
		return recordTypeVisibilities;
	}

	public void setRecordTypeVisibilities(List<RecordTypeVisibilities> recordTypeVisibilities) {
		this.recordTypeVisibilities = recordTypeVisibilities;
	}

	public List<ProfileActionOverrides> getProfileActionOverrides() {
		return profileActionOverrides;
	}

	public void setProfileActionOverrides(List<ProfileActionOverrides> profileActionOverrides) {
		this.profileActionOverrides = profileActionOverrides;
	}

	public List<ObjectPermissions> getObjectPermissions() {
		return objectPermissions;
	}

	public void setObjectPermissions(List<ObjectPermissions> objectPermissions) {
		this.objectPermissions = objectPermissions;
	}

	public List<LoginIpRanges> getLoginIpRanges() {
		return loginIpRanges;
	}

	public void setLoginIpRanges(List<LoginIpRanges> loginIpRanges) {
		this.loginIpRanges = loginIpRanges;
	}

	public List<LoginHours> getLoginHours() {
		return loginHours;
	}

	public void setLoginHours(List<LoginHours> loginHours) {
		this.loginHours = loginHours;
	}

	public List<LayoutAssignments> getLayoutAssignments() {
		return layoutAssignments;
	}

	public void setLayoutAssignments(List<LayoutAssignments> layoutAssignments) {
		this.layoutAssignments = layoutAssignments;
	}

	public List<FieldPermissions> getFieldPermissions() {
		return fieldPermissions;
	}

	public void setFieldPermissions(List<FieldPermissions> fieldPermissions) {
		this.fieldPermissions = fieldPermissions;
	}

	public List<FieldLevelSecurities> getFieldLevelSecurities() {
		return fieldLevelSecurities;
	}

	public void setFieldLevelSecurities(List<FieldLevelSecurities> fieldLevelSecurities) {
		this.fieldLevelSecurities = fieldLevelSecurities;
	}

	public List<ExternalDataSourceAccesses> getExternalDataSourceAccesses() {
		return externalDataSourceAccesses;
	}

	public void setExternalDataSourceAccesses(List<ExternalDataSourceAccesses> externalDataSourceAccesses) {
		this.externalDataSourceAccesses = externalDataSourceAccesses;
	}

	public List<CustomPermissions> getCustomPermissions() {
		return customPermissions;
	}

	public void setCustomPermissions(List<CustomPermissions> customPermissions) {
		this.customPermissions = customPermissions;
	}

	public List<CategoryGroupVisibilities> getCategoryGroupVisibilities() {
		return categoryGroupVisibilities;
	}

	public void setCategoryGroupVisibilities(List<CategoryGroupVisibilities> categoryGroupVisibilities) {
		this.categoryGroupVisibilities = categoryGroupVisibilities;
	}

	public List<ApplicationVisibilities> getApplicationVisibilities() {
		return applicationVisibilities;
	}

	public void setApplicationVisibilities(List<ApplicationVisibilities> applicationVisibilities) {
		this.applicationVisibilities = applicationVisibilities;
	}
	@Override
	public String toString() {
		return "Profile [classAccesses=" + classAccesses + ", pageAccesses=" + pageAccesses + ", userPermissions="
				+ userPermissions + ", custom=" + custom + ", userLicense=" + userLicense + ", fullName=" + fullName
				+ ", description=" + description + ", tabVisibilities=" + tabVisibilities + ", recordTypeVisibilities="
				+ recordTypeVisibilities + ", profileActionOverrides=" + profileActionOverrides + ", objectPermissions="
				+ objectPermissions + ", loginIpRanges=" + loginIpRanges + ", loginHours=" + loginHours
				+ ", layoutAssignments=" + layoutAssignments + ", fieldPermissions=" + fieldPermissions
				+ ", fieldLevelSecurities=" + fieldLevelSecurities + ", externalDataSourceAccesses="
				+ externalDataSourceAccesses + ", customPermissions=" + customPermissions
				+ ", categoryGroupVisibilities=" + categoryGroupVisibilities + ", applicationVisibilities="
				+ applicationVisibilities + "]";
	}
}
