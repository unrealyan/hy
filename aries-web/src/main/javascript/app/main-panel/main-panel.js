import React from 'react';

import { Location, Locations } from 'react-router-component';

import SystemSetting from './system-setting/system-setting';
import Dashboard from './dashboard/dashboard';
import LoanQuery from './loan-query/loan-query';
import NoticeCenter from '../side-bar/notice-center/notice-center';
import DailyNotice from '../side-bar/notice-center/daily－notice';
import NewRegistration from '../side-bar/notice-center/new-registration';
const MainPanel = () => (
    <div className="content">
        <Locations>
          <Location path="/" handler={DailyNotice} />
            <Location path="/view/noticeCenter/" handler={DailyNotice} />
            <Location path="/view/noticeCenter/dailyNotice" handler={DailyNotice} />
            <Location path="/view/noticeCenter/newRegistration" handler={NewRegistration} />
            <Location path="/view/dashboard(/*)" handler={Dashboard} />
            <Location path="/view/dashboard(/*)" handler={Dashboard} />
            <Location path="/view/dashboard(/*)" handler={Dashboard} />
            <Location path="/view/dashboard(/*)" handler={Dashboard} />
            <Location path="/view/dashboard(/*)" handler={Dashboard} />
            <Location path="/view/dashboard(/*)" handler={Dashboard} />
            <Location path="/view/dashboard(/*)" handler={Dashboard} />
            <Location path="/view/dashboard(/*)" handler={Dashboard} />
            <Location path="/view/dashboard(/*)" handler={Dashboard} />






          <Location path="/view/dashboard(/*)" handler={Dashboard} />
          <Location path="/view/system(/*)" handler={SystemSetting} />
          <Location path="/view/loan(/*)" handler={LoanQuery} />

        </Locations>
    </div>
);

export default MainPanel;