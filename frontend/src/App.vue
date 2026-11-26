<script lang="ts">
import TestModule from './testModule.vue';
// @ts-ignore
import Sidebar from './components/sidebar/Sidebar.vue';
import { sidebarWidth } from './components/sidebar/sidebarStatus.ts';

export default{
  components: {Sidebar},
  setup(){
    return { sidebarWidth }
  }
}
</script>

<template>
  <h1>Almond</h1>
  <Sidebar/>
  <div :style="{ 'margin-left': sidebarWidth}">
    <router-view />
  </div>
</template>

<style scoped>
@import url(stylesheets/fontImport);



</style>
