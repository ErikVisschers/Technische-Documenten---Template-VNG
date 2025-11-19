let respecConfig = {
  // ------------------------
  // Document metadata
  // ------------------------
  title: "Testen van de Technische Documentatie Template (VNG ReSpec)",
  subtitle: "Proof of Concept",
  shortName: "technische-documenten-template-test",
  specType: "HL", // e.g. NO, ST, IM, PR, HR, WD
  specStatus: "io", //e.g. WD, CR, PR, GN-WV,
  license: "eupl",


  // ------------------------
  // Versioning
  // ------------------------
  thisVersion: [...organisationConfig.thisVersion],
  latestVersion: [...organisationConfig.latestVersion],
  prevVersion: [...organisationConfig.prevVersion],
  // // keep publish metadata as you need
  // publishVersion: "2025-10-20",
  // publishDate: "2025-10-20",


  // ------------------------
  // Licensing
  // ------------------------
  license: organisationConfig.license,
  licenses: organisationConfig.licenses,

  // ------------------------
  // Editors / Authors
  // ------------------------
  editors: [
    {
      name: "Erik Visschers",
      company: "Smart-ICT",
      companyURL: "https://smart-ict.nl",
    }
  ],
  
  github: { repoURL: "https://github.com/ErikVisschers/Technische-Documenten---Template-VNG" },

  // ------------------------
  // Content sections
  // Content: keys are section titles (can be any unique keys)
  // values can be string paths or objects { path: '...', class: '...' }
  // ------------------------
  content: {
  "abstract": "content/abstract.md",
  "ch01": "content/ch01.md",
  "ch02": "content/ch02.md",
  "imvertor-logical": { path: "content/imvertor/doc/index.html", class: "imvertor-section" },
  "Leon's Chapter 1 - Generating": "content/mermaid1.md",
  "Leon's Chapter 2 - Assembling": "content/mermaid1.md"
  },

  // ------------------------
  // Bibliography
  // ------------------------
  localBiblio: {
      ...organisationConfig.localBiblio,  // Merge organisation-level refs
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

    // ------------------------
    // Misc / customization
    // ------------------------
    addSectionLinks: organisationConfig.addSectionLinks,
    postProcess: organisationConfig.postProcess || [],
    labelColor: organisationConfig.labelColor,
    localizationStrings: organisationConfig.localizationStrings

};

// Merge organisationConfig as fallback for any missing fields
respecConfig = {...organisationConfig, ...respecConfig};