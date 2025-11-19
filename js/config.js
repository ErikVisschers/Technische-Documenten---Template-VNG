var respecConfig = {
specStatus: "io",
shortName: "technische-documenten-template-test",
title: "Testen van de Technische Documentatie Template (VNG ReSpec)",
editors: [{ name: "Erik Visschers", company: "Smart-ICT" }],
authors: [{ name: "Erik Visschers", company: "Smart-ICT" }],
github: { repoURL: "https://github.com/ErikVisschers/Technische-Documenten---Template-VNG" },


// keep publish metadata as you need
publishVersion: "2025-10-20",
publishDate: "2025-10-20",


// Content: keys are section titles (can be any unique keys)
// values can be string paths or objects { path: '...', class: '...' }
content: {
"abstract": "content/abstract.md",
"ch01": "content/ch01.md",
"ch02": "content/ch02.md",
"imvertor-logical": { path: "content/imvertor/doc/index.html", class: "imvertor-section" }
}
};