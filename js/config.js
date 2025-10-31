const fs = require('fs');
const path = require('path');

function loadFile(filePath, type = "html") {
  try {
    const resolvedPath = path.resolve(__dirname, filePath);
    if (!fs.existsSync(resolvedPath)) {
      console.warn(`[Warning] ${type.toUpperCase()} file not found: ${resolvedPath}`);
      return `<p style="color:red">⚠️ Missing ${type.toUpperCase()} file: ${filePath}</p>`;
    }
    return fs.readFileSync(resolvedPath, 'utf-8');
  } catch (err) {
    console.error(`[Error] Failed to read ${type.toUpperCase()} file: ${filePath}`, err);
    return `<p style="color:red">⚠️ Error loading ${filePath}</p>`;
  }
}

var respecConfig = {
// 👇 Versie-informatie
  publishVersion: "2025-10-20",
  previousPublishVersion: "2025-09-10",
  publishDate: "2025-10-20",

// 👇 Overschrijft de organisatie-gegevens van VNG:
  nl_organisationName: "Smart-ICT B.V.",
  nl_organisationPublishURL: "https://erikvisschers.github.io/publicatie",
  
  logos: [{
    src: "media/letter_e_PNG34.png",
    alt: "Smart-ICT B.V.",
    height: 70,
    url: "https://www.smart-ict.com/",
    useLogo: true,
}],

// 👇 Algemene documentinformatie
  shortName: "technische-documenten-template-test",
  title: "Testen van de Technische Documentatie Template (gebaseerd op VNG ReSpec)",
  subtitle: "Proof of Concept check check",

  specStatus: "io",       // ✅ must match one in organisationConfig.localizationStrings.nl
  specType: "st",         // ✅ 'st' (Standaard) or 'im' (Informatiemodel) matches VNG config

  edDraftURI: "https://erikvisschers.github.io/Technische-Documenten---Template-VNG/", //aanbevolen door W3C / ReSpec
  license: "eupl",

  // 👇 Contact
  editors: [
    { name: "Erik Visschers", company: "Smart-ICT" }
  ],
  authors: [
    { name: "Erik Visschers", company: "Smart-ICT" }
  ],

  // 👇 GitHub-integratie (voor link “Bewerk op GitHub”)
  github: {
    repoURL: "https://github.com/ErikVisschers/Technische-Documenten---Template-VNG",
  },

  // 👇 Markdown-bestanden
  content: {
    // sleutel = markdown-bestandnaam zonder .md
    abstract: loadFile("content/abstract.md", "markdown"),
    ch01: loadFile("content/ch01.md", "markdown"),
    ch02: loadFile("content/ch02.md", "markdown"),
    imvertor: loadFile("content/generated/LOGICAL-JZV-1-20251001.respec.html", "html"),
    ch03: loadFile("content/ch03.md", "markdown"),
    ch04: loadFile("content/mermaid1.md", "markdown")
    // "Leon's Chapter 2 - Assembling": "content/mermaid1.md",
    // "Leon's Chapter 3 - Publishing": "content/mermaid.md",
    // "Leon's Chapter 4 - Foutoplossing": "content/abstract.md"
  },
  
  // 👇 Optioneel: eigen kleuraanpassingen (overrulen VNG-waarden)
  labelColor: {
    ig: "#008060", // in gebruik
    io: "#f57c00"  // in ontwikkeling
  }
};
