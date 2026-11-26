import { createApp } from 'vue'
import { createMemoryHistory, createRouter } from 'vue-router'
import App from './App.vue'

import OverviewPage from './pages/Overview.vue'
import ReportsPage from './pages/Reports.vue'
import SimulatorPage from './pages/Simulator.vue'

// list of routes
const routes = [
    {path: '/', component: OverviewPage}, 
    {path: '/reports', component: ReportsPage}, 
    {path: '/simulator', component: SimulatorPage}
]

// make sure to import whole components (vue files). => import ___ from _PATH_
// format => {path: '/', component: RegularView}


// initiate router + initiate app
export const router = createRouter(
    {
        history: createMemoryHistory(),
        routes,
    }
)

const app = createApp(App)
app.use(router)
app.mount('#app')
// if you ever use vue this is usually a one liner but better to look at it like this tbh

// all key code, and to be fair this shouldn't be used too much anyway