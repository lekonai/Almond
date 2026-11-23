<script setup lang="ts"></script>

<template>
  <h1>Almond</h1>
  <p>
    <b>
    VUEJS DOCS: <a href="https://vuejs.org/" target="_blank" rel="noopener">vuejs.org</a><br />
    MDN DOCS (for your other web needs. best web-based docs ever, genuinely): <a href="https://developer.mozilla.org/en-US/">MDN</a><br/>

    </b>
  </p>

  <p>
    Yo family, this is our Vue project. We are using the Composition API so make sure to use that when looking at documentation.
    <br />
    <br />
    GENERAL (frontend focussed) Coding practice:
    <ul>
      <li>Static elements such as images, audio, and such go in a static folder (or, the public folder)</li>
      <li>src will have all the key pages, stylesheets, so on. please folder them as appropriately so, i don't know how routing works when it comes for vue; you should just be able to freely create files and reference them</li>
      <li>vue allows for you to make components and make them reactive as well, please do research how they work, they're super convenient</li>
      <li>one of the most important: <b>css styling in a dedicated stylesheet</b> por favor!</li>
      <li>feel free to add modules/libraries whatever to frontend. i imagine threejs will have it's own thing, but that's for later worry</li>
      <li><b>... and most importantly, keep in communication of what you do.</b></li>
      <br/>
      <li>as for quarkus, man who knows how that stuff works, the project will communicate with a <b>RESTful API approach</b></li>
      <li>i have used <a href="https://quarkus.io/guides/getting-started/"> getting started quick guide</a><b> (up to step 4, cause bloody hell what does the rest mean. that requires research n that)</b></li>
      <li>run quarkus with <b>quarkus dev</b>, it's a really fun cute environment with testing and it's live, it's great.</li>
      <li>there's a bunch of nonsense that comes with quarkus as it comes with extensions, for example it has some docker config, which is a bit weird, oh well, clean up when you feel you know how allat works</li>
    </ul> 
    <br />
    To anyone new to programming web, use the <b>CLI</b> for commands. Make sure you have <b>TypeScript, Vue, and NodeJS</b> downloaded. You can live view what changes you're making with Vite, or
    some VSC extension similar, and to actually open up a view. run <b>npm run dev</b> to get a localhost.
  </p>
</template>

<style scoped></style>
