package com.example.demoJSonXML.hello;

import java.util.Arrays;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "Profile") public final class Profile {
	
	@JacksonXmlElementWrapper(localName = "classAccesses", useWrapping = false)
	public ClassAccesses[] classAccesses;
	
	@JacksonXmlElementWrapper(localName = "pageAccesses", useWrapping = false)
	public PageAccesses[] pageAccesses;
	
	@JacksonXmlElementWrapper(localName = "userPermissions", useWrapping = false)
	public UserPermissions[] userPermissions;
	
	@JacksonXmlProperty(localName = "custom", isAttribute = true)
	public boolean custom;
	
	@JacksonXmlProperty(localName = "userLicense", isAttribute = true)
	public String userLicense;
	
	@JacksonXmlProperty(localName = "fullName", isAttribute = true)
	public String fullName;
	
	@JacksonXmlProperty(localName = "description", isAttribute = true)
	public String description;
	
	@JacksonXmlElementWrapper(localName = "tabVisibilities", useWrapping = false)
	public TabVisibilities[] tabVisibilities;
	
	@JacksonXmlElementWrapper(localName = "recordTypeVisibilities", useWrapping = false)
	public RecordTypeVisibilities[] recordTypeVisibilities;
	
	@JacksonXmlElementWrapper(localName = "profileActionOverrides", useWrapping = false)
	public ProfileActionOverrides[] profileActionOverrides;
	
	@JacksonXmlElementWrapper(localName = "objectPermissions", useWrapping = false)
	public ObjectPermissions[] objectPermissions;
	
	@JacksonXmlElementWrapper(localName = "loginIpRanges", useWrapping = false)
	public LoginIpRanges[] loginIpRanges;
	
	@JacksonXmlElementWrapper(localName = "loginHours", useWrapping = false)
	public LoginHours[] loginHours;
	
	@JacksonXmlElementWrapper(localName = "layoutAssignments", useWrapping = false)
	public LayoutAssignments[] layoutAssignments;
	
	@JacksonXmlElementWrapper(localName = "fieldPermissions", useWrapping = false)
	public FieldPermissions[] fieldPermissions;
	
	@JacksonXmlElementWrapper(localName = "fieldLevelSecurities", useWrapping = false)
	public FieldLevelSecurities[] fieldLevelSecurities;
	
	@JacksonXmlElementWrapper(localName = "externalDataSourceAccesses", useWrapping = false)
	public ExternalDataSourceAccesses[] externalDataSourceAccesses;
	
	@JacksonXmlElementWrapper(localName = "customPermissions", useWrapping = false)
	public CustomPermissions[] customPermissions;
	
	@JacksonXmlElementWrapper(localName = "categoryGroupVisibilities", useWrapping = false)
	public CategoryGroupVisibilities[] categoryGroupVisibilities;
	
	@JacksonXmlElementWrapper(localName = "applicationVisibilities", useWrapping = false)
	public ApplicationVisibilities[] applicationVisibilities;
	
	public Profile() {
		
	}
	public Profile(ClassAccesses[] classAccesses, PageAccesses[] pageAccesses, UserPermissions[] userPermissions,
			boolean custom, String userLicense, String fullName, String description, TabVisibilities[] tabVisibilities,
			RecordTypeVisibilities[] recordTypeVisibilities, ProfileActionOverrides[] profileActionOverrides,
			ObjectPermissions[] objectPermissions, LoginIpRanges[] loginIpRanges, LoginHours[] loginHours,
			LayoutAssignments[] layoutAssignments, FieldPermissions[] fieldPermissions,
			FieldLevelSecurities[] fieldLevelSecurities, ExternalDataSourceAccesses[] externalDataSourceAccesses,
			CustomPermissions[] customPermissions, CategoryGroupVisibilities[] categoryGroupVisibilities,
			ApplicationVisibilities[] applicationVisibilities) {

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

	public ClassAccesses[] getClassAccesses() {
		return classAccesses;
	}

	public void setClassAccesses(ClassAccesses[] classAccesses) {
		this.classAccesses = classAccesses;
	}
	
	public PageAccesses[] getPageAccesses() {
		return pageAccesses;
	}
	
	public void setPageAccesses(PageAccesses[] pageAccesses) {
		this.pageAccesses = pageAccesses;
	}
	
	public UserPermissions[] getUserPermissions() {
		return userPermissions;
	}
	
	public void setUserPermissions(UserPermissions[] userPermissions) {
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

	public TabVisibilities[] getTabVisibilities() {
		return tabVisibilities;
	}

	public void setTabVisibilities(TabVisibilities[] tabVisibilities) {
		this.tabVisibilities = tabVisibilities;
	}

	public RecordTypeVisibilities[] getRecordTypeVisibilities() {
		return recordTypeVisibilities;
	}

	public void setRecordTypeVisibilities(RecordTypeVisibilities[] recordTypeVisibilities) {
		this.recordTypeVisibilities = recordTypeVisibilities;
	}

	public ProfileActionOverrides[] getProfileActionOverrides() {
		return profileActionOverrides;
	}

	public void setProfileActionOverrides(ProfileActionOverrides[] profileActionOverrides) {
		this.profileActionOverrides = profileActionOverrides;
	}

	public ObjectPermissions[] getObjectPermissions() {
		return objectPermissions;
	}

	public void setObjectPermissions(ObjectPermissions[] objectPermissions) {
		this.objectPermissions = objectPermissions;
	}

	public LoginIpRanges[] getLoginIpRanges() {
		return loginIpRanges;
	}

	public void setLoginIpRanges(LoginIpRanges[] loginIpRanges) {
		this.loginIpRanges = loginIpRanges;
	}

	public LoginHours[] getLoginHours() {
		return loginHours;
	}

	public void setLoginHours(LoginHours[] loginHours) {
		this.loginHours = loginHours;
	}

	public LayoutAssignments[] getLayoutAssignments() {
		return layoutAssignments;
	}

	public void setLayoutAssignments(LayoutAssignments[] layoutAssignments) {
		this.layoutAssignments = layoutAssignments;
	}

	public FieldPermissions[] getFieldPermissions() {
		return fieldPermissions;
	}

	public void setFieldPermissions(FieldPermissions[] fieldPermissions) {
		this.fieldPermissions = fieldPermissions;
	}

	public FieldLevelSecurities[] getFieldLevelSecurities() {
		return fieldLevelSecurities;
	}

	public void setFieldLevelSecurities(FieldLevelSecurities[] fieldLevelSecurities) {
		this.fieldLevelSecurities = fieldLevelSecurities;
	}

	public ExternalDataSourceAccesses[] getExternalDataSourceAccesses() {
		return externalDataSourceAccesses;
	}

	public void setExternalDataSourceAccesses(ExternalDataSourceAccesses[] externalDataSourceAccesses) {
		this.externalDataSourceAccesses = externalDataSourceAccesses;
	}

	public CustomPermissions[] getCustomPermissions() {
		return customPermissions;
	}

	public void setCustomPermissions(CustomPermissions[] customPermissions) {
		this.customPermissions = customPermissions;
	}

	public CategoryGroupVisibilities[] getCategoryGroupVisibilities() {
		return categoryGroupVisibilities;
	}

	public void setCategoryGroupVisibilities(CategoryGroupVisibilities[] categoryGroupVisibilities) {
		this.categoryGroupVisibilities = categoryGroupVisibilities;
	}

	public ApplicationVisibilities[] getApplicationVisibilities() {
		return applicationVisibilities;
	}

	public void setApplicationVisibilities(ApplicationVisibilities[] applicationVisibilities) {
		this.applicationVisibilities = applicationVisibilities;
	}

	@Override
	public String toString() {
		return "Profile [classAccesses=" + Arrays.toString(classAccesses) + ", pageAccesses="
				+ Arrays.toString(pageAccesses) + ", userPermissions=" + Arrays.toString(userPermissions) + ", custom="
				+ custom + ", userLicense=" + userLicense + ", fullName=" + fullName + ", description=" + description
				+ ", tabVisibilities=" + Arrays.toString(tabVisibilities) + ", recordTypeVisibilities="
				+ Arrays.toString(recordTypeVisibilities) + ", profileActionOverrides="
				+ Arrays.toString(profileActionOverrides) + ", objectPermissions=" + Arrays.toString(objectPermissions)
				+ ", loginIpRanges=" + Arrays.toString(loginIpRanges) + ", loginHours=" + Arrays.toString(loginHours)
				+ ", layoutAssignments=" + Arrays.toString(layoutAssignments) + ", fieldPermissions="
				+ Arrays.toString(fieldPermissions) + ", fieldLevelSecurities=" + Arrays.toString(fieldLevelSecurities)
				+ ", externalDataSourceAccesses=" + Arrays.toString(externalDataSourceAccesses) + ", customPermissions="
				+ Arrays.toString(customPermissions) + ", categoryGroupVisibilities="
				+ Arrays.toString(categoryGroupVisibilities) + ", applicationVisibilities="
				+ Arrays.toString(applicationVisibilities) + "]";
	}
}
