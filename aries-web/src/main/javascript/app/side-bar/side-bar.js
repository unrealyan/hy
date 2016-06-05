import React, { PropTypes } from 'react';
import {registerReducer} from 'reducers';
import { Link } from 'react-router-component';
import classNames from 'classnames';
import { connect } from 'react-redux';

const LOAN_NUM = 'LOAN_NUM';

const SideBar = ({showSideBar, loanNum, getLoanNum}) => {
    var sideBarClass = classNames({sidebar: true, clearfix: true, hidden: !showSideBar})
    setTimeout(()=>{
        //ajax count loan num
        getLoanNum(9999999);
    }, 5000);
    return <div className={sideBarClass}>
        <ul className="sidebar-panel nav">
            <li className="sidetitle">操作中心</li>


            <li><Link href="/view/noticeCenter/"><span className="icon color6"><i className="fa fa-envelope-o"></i></span>通知中心<span className="label label-default">19</span></Link></li>
            <div>
                <li><Link href="/view/noticeCenter/dailyNotice/"><span className="icon color6"></span>每日通知<span className="label label-default">19</span></Link></li>
                <li><Link href="/view/noticeCenter/newRegistration"><span className="icon color6"></span>新增报名<span className="label label-default">19</span></Link></li>
                <li><Link href="/view/noticeCenter/"><span className="icon color6"></span>新增放款<span className="label label-default">19</span></Link></li>
                <li><Link href="/view/noticeCenter/"><span className="icon color6"></span>放款失败<span className="label label-default">19</span></Link></li>
            </div>

            <li><Link href="/view/noticeCenter/"><span className="icon color6"><i className="fa fa-envelope-o"></i></span>工作台<span className="label label-default">19</span></Link></li>
            <div>
                <li><Link href="/view/noticeCenter/"><span className="icon color6"></span>发起放款录入<span className="label label-default">19</span></Link></li>
                <li><Link href="/view/noticeCenter/"><span className="icon color6"></span>发起还款录入<span className="label label-default">19</span></Link></li>
                <li><Link href="/view/noticeCenter/"><span className="icon color6"></span>变更还款计划<span className="label label-default">19</span></Link></li>
                <li><Link href="/view/noticeCenter/"><span className="icon color6"></span>发起尽职调查<span className="label label-default">19</span></Link></li>
                <li><Link href="/view/noticeCenter/"><span className="icon color6"></span>发起信托计划<span className="label label-default">19</span></Link></li>
                <li><Link href="/view/noticeCenter/"><span className="icon color6"></span>发起资管计划<span className="label label-default">19</span></Link></li>
                <li><Link href="/view/noticeCenter/"><span className="icon color6"></span>新增资金<span className="label label-default">19</span></Link></li>
                <li><Link href="/view/noticeCenter/"><span className="icon color6"></span>待处理工单<span className="label label-default">19</span></Link></li>
                <li><Link href="/view/noticeCenter/"><span className="icon color6"></span>新增操作员<span className="label label-default">19</span></Link></li>
            </div>

            <li><Link href="/view/noticeCenter/"><span className="icon color6"><i className="fa fa-envelope-o"></i></span>资产概况<span className="label label-default">19</span></Link></li>
            <div>
                <li><Link href="/view/noticeCenter/"><span className="icon color6"></span>信托计划切换<span className="label label-default">19</span></Link></li>
                <li><Link href="/view/noticeCenter/"><span className="icon color6"></span>客户数｜资产规模<span className="label label-default">19</span></Link></li>
            </div>

            <li><Link href="/view/noticeCenter/"><span className="icon color6"><i className="fa fa-envelope-o"></i></span>现金流情况<span className="label label-default">19</span></Link></li>

            <li><Link href="/view/noticeCenter/"><span className="icon color6"><i className="fa fa-envelope-o"></i></span>待放款信息<span className="label label-default">19</span></Link></li>

            <li><Link href="/view/noticeCenter/"><span className="icon color6"><i className="fa fa-envelope-o"></i></span>待还款信息<span className="label label-default">19</span></Link></li>


            <li><Link href="/view/noticeCenter/"><span className="icon color6"><i className="fa fa-envelope-o"></i></span>还款流水查询<span className="label label-default">19</span></Link></li>

            <li><Link href="/view/noticeCenter/"><span className="icon color6"><i className="fa fa-envelope-o"></i></span>支用查询<span className="label label-default">19</span></Link></li>
            <li><Link href="/view/noticeCenter/"><span className="icon color6"><i className="fa fa-envelope-o"></i></span>客户信息查询<span className="label label-default">19</span></Link></li>
            <li><Link href="/view/noticeCenter/"><span className="icon color6"><i className="fa fa-envelope-o"></i></span>逾期查询<span className="label label-default">19</span></Link></li>
            <li><Link href="/view/noticeCenter/"><span className="icon color6"><i className="fa fa-envelope-o"></i></span>资产分析<span className="label label-default">19</span></Link></li>

            <li><Link href="/view/noticeCenter/"><span className="icon color6"><i className="fa fa-envelope-o"></i></span>报表下载<span className="label label-default">19</span></Link></li>






            <li><Link href="/view/dashboard/">
                <span className="icon color5">
                    <i className="fa fa-home"></i>
                </span>Dashboard<span className="label label-default">2</span>
                </Link>
            </li>
            <li><Link href="/view/system/"><span className="icon color6"><i className="fa fa-envelope-o"></i></span>System Setting<span className="label label-default">19</span></Link></li>
            <li><Link href="/view/loan/"><span className="icon color6"><i className="fa fa-envelope-o"></i></span>Loan<span className="label label-default">{loanNum}</span></Link></li>
        </ul>
    </div>
};

SideBar.propTypes = {
    showSideBar: PropTypes.bool.isRequired,
    loanNum: PropTypes.number.isRequired
};

const loanNum = (num) => {
    return {
        type: LOAN_NUM,
        num
    }
};

registerReducer(LOAN_NUM, (state, action) => {

    state.loanNum = action.num;
    return state;
});

const mapStateToProps = (state) =>
    ({
        showSideBar: state.main.showSideBar,
        loanNum: state.main.loanNum
    });

const mapDispatchToProps = (dispatch) => {
    return {
        getLoanNum: (num) => {
            dispatch(loanNum(num));
        }
    }
};

const SideBarWrapper = connect(
  mapStateToProps,
  mapDispatchToProps
)(SideBar);

export default SideBarWrapper;