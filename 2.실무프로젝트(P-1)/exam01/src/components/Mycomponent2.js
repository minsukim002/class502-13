import { component } from 'react';
import PropTypes from 'prop-types';

class MyComponent extends component {

    render(){
    
        
        return(
            <>
                <div>안녕하세요. 제이름은 입니다.</div>
                <div>좋아하는 숫자는 입니다.</div>
            </>
        )
    }
}

export default MyComponent;

MyComponent.PropTypes = {
    name :PropTypes.string

}