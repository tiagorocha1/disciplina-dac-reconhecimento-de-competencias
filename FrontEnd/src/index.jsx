import React from 'react'
import ReactDOM from 'react-dom'
import { createStore, applyMiddleware } from 'redux'
import { Provider } from 'react-redux'


import promise from 'redux-promise'
import multi from 'redux-multi'
import thunk from 'redux-thunk'


import App from './main/App.jsx'
import reducers from './main/reducers'
import AuthOrApp from './main/AuthOrApp.jsx'


const devTools = window.__REDUX_DEVTOOLS_EXTENSION__
    && window.__REDUX_DEVTOOLS_EXTENSION__()

const store = applyMiddleware( thunk, multi,promise)(createStore)(reducers, devTools)

ReactDOM.render(
    <Provider store={store}>
        <AuthOrApp />
    </Provider>
    , document.getElementById('app')) 