import styled, { css } from 'styled-components';

export const BigButton = styled.button`
  width: 100%;
  height: 45px;
  border: 0;
  font-size: 1.5rem;
  font-weight: bold;
  background: ${(bgcolor) => bgcolor ?? 'orange'};

  ${(selected) =>
    selected &&
    css`

  `}
`;
