let respecConfig = {
  title: "Testen van de Technische Documentatie Template (VNG ReSpec)",
  subtitle: "Proof of Concept",
  shortName: "technische-documenten-template-test",
  specType: "HL",
  specStatus: "IO",

  thisVersion: organisationConfig.thisVersion,
  latestVersion: organisationConfig.latestVersion,
  prevVersion: organisationConfig.prevVersion,

  license: organisationConfig.license,
  licenses: organisationConfig.licenses,

  editors: [{
    name: "Erik Visschers",
    company: "Smart-ICT",
    companyURL: "https://smart-ict.com"
  }],

  github: { repoURL: "https://github.com/ErikVisschers/Technische-Documenten---Template-VNG" },
  
  // ------------------------
  // Content sections
  // ------------------------


  localBiblio: {
    ...organisationConfig.localBiblio,
    MIM: {
      "href": "https://docs.geostandaarden.nl/mim/mim/",
      "publisher": "Geonovum",
      "title": "MIM - Metamodel Informatie Modellering",
      "date": "Oktober 2023",
      "rawDate": "2023"
    },
    SemVer: {
      "href": "https://semver.org/lang/nl/",
      "title": "Semantisch Versioneren 2.0.0",
      "date": "December 19, 2023",
      "rawDate": "2023"
    }
  },

  addSectionLinks: organisationConfig.addSectionLinks,
  postProcess: organisationConfig.postProcess || [],
  labelColor: organisationConfig.labelColor,
  localizationStrings: organisationConfig.localizationStrings
};

// Merge organisationConfig fallback
respecConfig = { ...organisationConfig, ...respecConfig };
