<script>
import { collapsed, toggleSidebar, sidebarWidth } from './sidebarStatus';
import SidebarLink from './SidebarLink.vue';

export default {
    props: {},
    components: {SidebarLink},
    setup() {
        return { collapsed, toggleSidebar, sidebarWidth }
    }
}
</script>


<template>
<div class="sidebar" :style="{width: sidebarWidth}">
    <h1>
        <span v-if="collapsed">
            <!-- put some sort of almond icon here i guess -->
        </span>
        <span v-else>Almond</span>
    </h1>

    <!-- need to do -->
    <SidebarLink to="/" icon="">Overview</SidebarLink>
    <SidebarLink to="/simulator" icon="">Simulator</SidebarLink>
    <SidebarLink to="/reports" icon="">Reports</SidebarLink>



    <span class="collapseButton" :class="{'rotate180': collapsed}" @click="toggleSidebar">clps</span>

</div>
</template>

<style scoped>

/* placeholder colours as well */

:root{
    --sidebar-bg-colour: lightgreen;
    --sidebar-active-colour: black;
    --sidebar-hover-colour: darkgreen;
}

.sidebar{
    color:white;
    background-color: lightgreen;

    float: flex;
    position: fixed;
    z-index: 1;
    top: 0;
    left: 0;
    bottom: 0;
    padding: 0.5em;

    transition: 0.3s ease;

    display: flex;
    flex-direction: column;
}

.collapseButton{
    position: absolute;
    bottom: 0;
    padding: 0.75em;

    color: white;

    transition: 0.2s linear;
}

.rotate180{
    transform: rotate(180deg);
    transition: 0.2s linear;
}
</style>