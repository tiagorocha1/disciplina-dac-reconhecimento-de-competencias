import React from "react";
import PageHeader from "../template/PageHeader"
import TaskForm from './TaskForm'
import TaskList from './TaskList'

export default props => (
    <div>
        <PageHeader name='Tasks' small='Register'></PageHeader>
        <TaskForm />
        <TaskList />

    </div>
)


